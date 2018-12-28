package basicutilities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.google.common.base.Optional;

public class VoidUseOfNullTest {
	
	
	// 使用optional来替代null表示明确的值
	@Test
	public void testOptional() {
		Optional<Integer> possible = Optional.of(100);
		System.out.println(possible.isPresent());
		System.out.println(possible.get());
		System.out.println("----------------");
		possible.asSet().forEach(System.out::println);
		
		Optional<Object> isNull = Optional.fromNullable(null);
		System.out.println(isNull.isPresent());
		System.out.println(isNull.or(100));
		assertEquals(isNull.or(100), 100);
	}
	
	@Test
	public void testObjects() {
	}
}
