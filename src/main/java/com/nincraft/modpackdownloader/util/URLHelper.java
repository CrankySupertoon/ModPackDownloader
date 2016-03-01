package com.nincraft.modpackdownloader.util;

public final class URLHelper {
	private static final String WHITESPACE = " ";
	private static final String WHITESPACE_ENCODED = "%20";

	private URLHelper() {
	}

	public static String encodeSpaces(final String url) {
		return url.replace(WHITESPACE, WHITESPACE_ENCODED);
	}

	public static String decodeSpaces(final String url) {
		return url.replace(WHITESPACE_ENCODED, WHITESPACE);
	}
}
