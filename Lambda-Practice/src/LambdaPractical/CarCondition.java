
package LambdaPractical;
@FunctionalInterface
public interface CarCondition <T> {
	public boolean test(T c);
}
