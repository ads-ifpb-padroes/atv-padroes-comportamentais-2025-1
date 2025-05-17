package atv2;

public interface Item {
    <T> T accept(ItemVisitor<T> visitor);
}
