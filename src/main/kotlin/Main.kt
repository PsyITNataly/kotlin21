fun main() {
    val amount: Int = 10_000;
    val commission: Int = amount * 75 / 10000;
    val result = if (commission < 35) 35 else commission;
    println(result);
}