import java.util.stream.IntStream;

class ReverseString {
  
    String reverse(final String string) {

    	// first iteration:
    	return new StringBuilder(string).reverse().toString();


    	// from http://exercism.io/submissions/8758ecde5f0049e59f323a1fd55f7968
		// char[] array = string.toCharArray();
    	
  //   	return IntStream.range(0, array.length)
		// 		.mapToObj(i -> array[array.length - i - 1])
		// 		.collect(StringBuffer::new, StringBuffer::appendCodePoint, StringBuffer::append)
		// 		.toString();

    }
  
}