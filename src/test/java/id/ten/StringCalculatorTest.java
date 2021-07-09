package id.ten;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Package: id.ten
 * <p>
 * User: TetenNugraha
 * Date: 7/9/2021
 * Time: 9:42 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculatorTest {

    @Test
    @DisplayName("Test Penambahan dengan input a dan b yang valid")
    public void add_withProperValue_thenReturnedValid() {
        assertEquals("3", StringCaculator.add(1,2));
    }

    @Test
    @DisplayName("Test Penghapusan dengan input a dan b yang valid")
    public void hapus_withProperValue_thenReturnedValidValue() {
        assertEquals("2", StringCaculator.hapus(4,2));
    }

    @Test
    @DisplayName("Test Perkalian dengan input a dan b yang valid")
    public void kali_withProperValue_thenReturnedValidValue() {
        assertEquals("15", StringCaculator.kali(3, 5));
    }

    @Test
    @DisplayName("Test Pembagian dengan input a dan b yang valid")
    public void bagi_withProperValue_thenReturnedValidValue() {
        assertEquals("2", StringCaculator.bagi(4,2));
    }

    @Test
    @DisplayName("Test Penambahan dengan input b = 0")
    public void bagi_withZeroB_thenreturnErrorText() {
        assertEquals("Cannot divided by Zero", StringCaculator.bagi(2,0));
    }
}
