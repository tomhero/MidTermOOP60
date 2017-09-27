package com.company;

/**
 * Sibyl Sybil Forecaster Predictor ... something like that
 * To Anticipate someone fate
 */
public class Sibyl {

    private int realCode;

    public void encode(String rawCode) {
        // forecast here!!

        // 1. Initial value of real forecast code
        realCode = Integer.parseInt(rawCode);

        // 2. if value of forecast code is more than 9, then re-calculate
        while (realCode > 9) {
            // 3. calculate forecast code value below
            String tmpCode = String.valueOf(realCode);
            String[] tmpArrayOfCode = tmpCode.split("");
            int tmpRealCode = 0;
            for (int i = 0; i < tmpArrayOfCode.length; i++) {
                tmpRealCode += Integer.parseInt(tmpArrayOfCode[i]);
            }
            realCode = tmpRealCode;
        }
    }

    public int getCode() {
        return realCode;
    }

}
