package basicutilities;

import org.junit.Test;

import com.google.common.base.Optional;

public class VoidUseOfNullTest {

	@Test
	public void testOptional() {
		Optional<Integer> possible = Optional.of(100);
		System.out.println(possible.isPresent());

	}
}
