package com.ms.learning.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;

public class NumberUtil {
    private static final int DEFAULT_SCALE = 4;
    private static final RoundingMode DEFAULT_ROUNDING_MODE;
    private static final DecimalFormat DF_SCALE_2;

    public NumberUtil() {
    }

    public static String format2Scale(BigDecimal number) {
        return DF_SCALE_2.format(number);
    }

    public static String format2Scale(double number) {
        return DF_SCALE_2.format(number);
    }

    public static boolean isZero(BigDecimal num) {
        return null == num || BigDecimal.ZERO.equals(num);
    }

    public static boolean isZero(Integer num) {
        return null == num || num == 0;
    }

    public static BigDecimal addWithDown(BigDecimal... values) {
        return addWithDown(4, values);
    }

    public static BigDecimal addWithDown(int scale, BigDecimal... values) {
        return addWithDown(scale, DEFAULT_ROUNDING_MODE, values);
    }

    public static BigDecimal addWithDown(int scale, RoundingMode roundingMode, BigDecimal... values) {
        BigDecimal total = add(values);
        return doStripTrailingZeros(total.setScale(scale, roundingMode));
    }

    public static BigDecimal addWithDown(int scale, int roundingMode, BigDecimal... values) {
        BigDecimal total = add(values);
        return doStripTrailingZeros(total.setScale(scale, roundingMode));
    }

    public static BigDecimal add(BigDecimal... values) {
        if (arrayIsEmpty(values)) {
            return BigDecimal.ZERO;
        } else {
            BigDecimal total = BigDecimal.ZERO;
            BigDecimal[] var2 = values;
            int var3 = values.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                BigDecimal decimal = var2[var4];
                total = total.add(dealNullBigDecimal(decimal));
            }

            return total;
        }
    }

    public static BigDecimal subtractWithDomn(BigDecimal... values) {
        return subtractWithDomn(4, values);
    }

    public static BigDecimal subtractWithDomn(int scale, BigDecimal... values) {
        return subtractWithDomn(scale, DEFAULT_ROUNDING_MODE, values);
    }

    public static BigDecimal subtractWithDomn(int scale, RoundingMode roundingMode, BigDecimal... values) {
        BigDecimal total = subtract(values);
        return doStripTrailingZeros(total.setScale(scale, roundingMode));
    }

    public static BigDecimal subtractWithDomn(int scale, int roundingMode, BigDecimal... values) {
        BigDecimal total = subtract(values);
        return doStripTrailingZeros(total.setScale(scale, roundingMode));
    }

    public static BigDecimal subtract(BigDecimal... values) {
        if (arrayIsEmpty(values)) {
            return BigDecimal.ZERO;
        } else {
            BigDecimal total = dealNullBigDecimal(values[0]);

            for(int i = 1; i < values.length; ++i) {
                total = total.subtract(dealNullBigDecimal(values[i]));
            }

            return total;
        }
    }

    public static BigDecimal multiplyWithDomn(BigDecimal... values) {
        return multiplyWithDomn(4, values);
    }

    public static BigDecimal multiplyWithDomn(int scale, BigDecimal... values) {
        return multiplyWithDomn(scale, DEFAULT_ROUNDING_MODE, values);
    }

    public static BigDecimal multiplyWithDomn(int scale, RoundingMode roundingMode, BigDecimal... values) {
        BigDecimal total = multiply(values);
        return doStripTrailingZeros(total.setScale(scale, roundingMode));
    }

    public static BigDecimal multiplyWithDomn(int scale, int roundingMode, BigDecimal... values) {
        BigDecimal total = multiply(values);
        return doStripTrailingZeros(total.setScale(scale, roundingMode));
    }

    private static BigDecimal multiply(BigDecimal... values) {
        if (!arrayIsEmpty(values) && !containsZero(values)) {
            BigDecimal total = BigDecimal.ONE;
            BigDecimal[] var2 = values;
            int var3 = values.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                BigDecimal decimal = var2[var4];
                total = total.multiply(decimal);
            }

            return total;
        } else {
            return BigDecimal.ZERO;
        }
    }

    public static BigDecimal divideWithDomn(BigDecimal... values) {
        return divideWithDomn(4, values);
    }

    public static BigDecimal divideWithDomn(int scale, BigDecimal... values) {
        return divideWithDomn(scale, DEFAULT_ROUNDING_MODE, values);
    }

    public static BigDecimal divideWithDomn(int scale, RoundingMode roundingMode, BigDecimal... values) {
        if (!arrayIsEmpty(values) && !containsZero(values) && !isZero(values[0])) {
            BigDecimal total = dealNullBigDecimal(values[0]);

            for(int i = 1; i < values.length; ++i) {
                total = total.divide(values[i], scale, roundingMode);
            }

            return doStripTrailingZeros(total.setScale(scale, roundingMode));
        } else {
            return BigDecimal.ZERO;
        }
    }

    public static BigDecimal divideWithDomn(int scale, int roundingMode, BigDecimal... values) {
        if (!arrayIsEmpty(values) && !containsZero(values) && !isZero(values[0])) {
            BigDecimal total = dealNullBigDecimal(values[0]);

            for(int i = 1; i < values.length; ++i) {
                total = total.divide(values[i], scale, roundingMode);
            }

            return doStripTrailingZeros(total.setScale(scale, roundingMode));
        } else {
            return BigDecimal.ZERO;
        }
    }

    public static BigDecimal setRoundDown(BigDecimal v1) {
        if (isNull(v1)) {
            v1 = BigDecimal.ZERO;
        }

        return doStripTrailingZeros(v1.setScale(4, RoundingMode.HALF_UP));
    }

    public static BigDecimal setScale(BigDecimal v1, int scale, RoundingMode roundingMode) {
        if (isNull(v1)) {
            v1 = BigDecimal.ZERO;
        }

        return doStripTrailingZeros(v1.setScale(scale, roundingMode));
    }

    public static BigDecimal setScale(BigDecimal v1, int scale, int roundingMode) {
        if (isNull(v1)) {
            v1 = BigDecimal.ZERO;
        }

        return doStripTrailingZeros(v1.setScale(scale, roundingMode));
    }

    public static BigDecimal doStripTrailingZeros(BigDecimal v1) {
        if (isNull(v1)) {
            v1 = BigDecimal.ZERO;
        }

        String str = v1.toString();
        return str.indexOf(".") != -1 && str.charAt(str.length() - 1) == '0' ? doStripTrailingZeros(new BigDecimal(str.substring(0, str.length() - 1))) : new BigDecimal(str.charAt(str.length() - 1) == '.' ? str.substring(0, str.length() - 1) : str);
    }

    public static BigDecimal defaultIfNull(BigDecimal decimal, BigDecimal defaultValue) {
        return isZero(decimal) ? defaultValue : decimal;
    }

    public static BigDecimal defaultZeroIfNull(BigDecimal decimal) {
        return defaultIfNull(decimal, BigDecimal.ZERO);
    }

    public static BigDecimal dealNullBigDecimal(BigDecimal decimal) {
        if (isNull(decimal)) {
            decimal = BigDecimal.ZERO;
        }

        return decimal;
    }

    public static String splitNumberAndJoin(int num, String joinFor) {
        String temp = String.valueOf(num);
        if (org.apache.commons.lang3.StringUtils.isNotBlank(temp)) {
            String[] temps = temp.split("");
            if (null != temps && 0 < temps.length) {
                StringBuffer buffer = new StringBuffer();

                for(int i = 0; i < temps.length; ++i) {
                    if (org.apache.commons.lang3.StringUtils.isNotBlank(temps[i])) {
                        buffer.append(temps[i].trim());
                        if (i < temps.length - 1) {
                            buffer.append(joinFor);
                        }
                    }
                }

                return buffer.toString();
            }
        }

        return null;
    }

    public static int compareTo(BigDecimal value1, BigDecimal value2) {
        if (isNull(value1) && isNull(value2)) {
            return 0;
        } else {
            return (!isNull(value1) || isNull(value2)) && (isNull(value1) || !isNull(value2)) ? value1.compareTo(value2) : -2;
        }
    }

    public static boolean isLessThen(BigDecimal value1, BigDecimal value2) {
        return compareTo(value1, value2) == -1;
    }

    public static boolean isLessThenZero(BigDecimal value) {
        return compareTo(value, BigDecimal.ZERO) == -1;
    }

    public static boolean isLargerThen(BigDecimal value1, BigDecimal value2) {
        return compareTo(value1, value2) == 1;
    }

    public static boolean isLargerThenZero(BigDecimal value) {
        return compareTo(value, BigDecimal.ZERO) == 1;
    }

    public static boolean equals(BigDecimal value1, BigDecimal value2) {
        return compareTo(value1, value2) == 0;
    }

    public static boolean isLargerThenOrEquals(BigDecimal value1, BigDecimal value2) {
        return isLargerThen(value1, value2) || equals(value1, value2);
    }

    public static boolean isLargerThenOrEqualsZero(BigDecimal value) {
        return isLargerThenZero(value) || equals(value, BigDecimal.ZERO);
    }

    public static boolean isLessThenOrEquals(BigDecimal value1, BigDecimal value2) {
        return isLessThen(value1, value2) || equals(value1, value2);
    }

    public static boolean isLessThenOrEqualsZero(BigDecimal value) {
        return isLessThenZero(value) || equals(value, BigDecimal.ZERO);
    }

    public static boolean isNull(BigDecimal value) {
        return null == value;
    }

    public static boolean isNullBoth(BigDecimal... values) {
        return isAnyDecimalBoth((BigDecimal)null, values);
    }

    public static boolean isZeroBoth(BigDecimal... values) {
        return isAnyDecimalBoth(BigDecimal.ZERO, values);
    }

    public static boolean isAnyDecimalBoth(BigDecimal matchDecimal, BigDecimal... values) {
        if (!isNull(matchDecimal) || null != values && 0 < values.length) {
            if (null != values && 0 < values.length) {
                BigDecimal[] var2 = values;
                int var3 = values.length;

                for(int var4 = 0; var4 < var3; ++var4) {
                    BigDecimal decimal = var2[var4];
                    if (!equals(decimal, matchDecimal)) {
                        return false;
                    }
                }

                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    private static boolean contains(BigDecimal[] values, BigDecimal target) {
        return Arrays.asList(values).contains(target);
    }

    private static boolean containsZero(BigDecimal[] values) {
        return contains(values, BigDecimal.ZERO);
    }

    private static boolean arrayIsEmpty(BigDecimal[] values) {
        return null == values || 0 >= values.length;
    }

    static {
        DEFAULT_ROUNDING_MODE = RoundingMode.HALF_UP;
        DF_SCALE_2 = new DecimalFormat("#.00");
    }
}
