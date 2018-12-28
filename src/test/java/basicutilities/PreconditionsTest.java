package basicutilities;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class PreconditionsTest {

	@Test
	public void testPrecondition() {
		assertEquals(Objects.equal("a", "a"), true);
		assertEquals(Objects.equal(null, "a"), false);
		assertEquals(Objects.equal("a", null), false);
		assertEquals(Objects.equal(null, null), true);

		assertEquals(Objects.hashCode("a", "b", "x"), Objects.hashCode("a", "b", "x"));
		String string = MoreObjects.toStringHelper(this).add("x", 1).toString();
		System.out.println(string);
		System.out.println(MoreObjects.toStringHelper("MyObject").add("y", 1).toString());

		assertEquals(new Person().compareTo(new Person()), true);

	}

	public void test(int a, int b) {
		checkArgument(a >= 0, "Argument was %s but expected nonnegative", a);
		checkArgument(a < b, "Expected a < b, but %s > %s", a, b);
	}

	private void testcheckArgumentIsTrue(boolean bool) {
		checkArgument(bool);

	}

	private void testCheckNotNull(Object obj) {
		checkNotNull(obj);
	}
}
