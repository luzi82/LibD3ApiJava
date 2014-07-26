package com.luzi82.d3.communityapi.test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.luzi82.d3.communityapi.Value;

public class AttributesRawGen {

	public static final String TMP_FOLDER = "tmp";
	public static final String SCAN_FOLDER = "sample/scan";

	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
		Dumper dumper = new Dumper();
		// boolean good = true;
		File scanFile = new File(SCAN_FOLDER);
		File[] scanFileSubList = scanFile.listFiles();
		for (File scanFileSub : scanFileSubList) {
			if (!scanFileSub.isDirectory())
				continue;
			File[] jFileList = scanFileSub.listFiles();
			for (File jFile : jFileList) {
				// String jFileName = jFile.getName();
				ObjectMapper mapper = new ObjectMapper();
				dumper.walk(mapper.readValue(jFile, Map.class));
			}
		}
		// Assert.assertTrue(good);
		String[] kV = dumper.keySet.toArray(new String[0]);
		Arrays.sort(kV);
		// for (String k : kV) {
		// System.err.println(k);
		// }

		System.out.println("package com.luzi82.d3.communityapi;");
		System.out.println("import com.fasterxml.jackson.annotation.JsonProperty;");
		System.out.println("public class AttributesRaw {");

		for (String k : kV) {
			System.out.println("@JsonProperty(\"" + k + "\")");
			System.out.println("public Value<Float> " + k.replaceAll(Pattern.quote("#"), "_") + ";");
		}

		System.out.println("}");
	}

	static class Dumper {

		public Set<String> keySet = new HashSet<String>();

		public void walk(Object obj) {
			if (obj == null)
				return;
			if (obj instanceof Map<?, ?>) {
				Map<?, ?> m = (Map<?, ?>) obj;
				for (Map.Entry<?, ?> me : m.entrySet()) {
					if (me.getKey().equals("attributesRaw")) {
						scanKey(me.getValue());
					}
					walk(me.getValue());
				}
				return;
			}
			if (obj instanceof Iterable<?>) {
				Iterable<?> ita = (Iterable<?>) obj;
				for (Object i : ita) {
					walk(i);
				}
				return;
			}
			// if (obj.getClass().isPrimitive()) {
			// return;
			// }
			if (obj.getClass() == String.class) {
				return;
			}
			if (obj.getClass() == Integer.class) {
				return;
			}
			if (obj.getClass() == Float.class) {
				return;
			}
			if (obj.getClass() == Boolean.class) {
				return;
			}
			if (obj.getClass() == Double.class) {
				return;
			}
			System.err.println(obj.getClass().getName());
		}

		public void scanKey(Object obj) {
			if (obj == null)
				return;
			if (!(obj instanceof Map<?, ?>))
				return;
			Map<?, ?> m = (Map<?, ?>) obj;
			for (Object k : m.keySet()) {
				if (!(k instanceof String))
					continue;
				String ks = (String) k;
				keySet.add(ks);
			}
		}

	}

}
