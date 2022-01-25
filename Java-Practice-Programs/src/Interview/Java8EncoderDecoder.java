package Interview;

import java.util.Base64;
import java.util.stream.Stream;

public class Java8EncoderDecoder {

	public static void main(String[] args) {
		Base64.Encoder encoder = Base64.getEncoder();
		Base64.Decoder decoder = Base64.getDecoder();
		
		String url = encoder.encodeToString("www.google.com".getBytes());
		System.out.println(url);
		
		String decodedUrl = new String(decoder.decode(url));
		System.out.println(decodedUrl);
	}
}
