public class Final {

    public static int contarTemperaturasAltas(int[][] m) {
        int c = 0;
        for (int[] f : m)
            for (int t : f)
                if (t > 60) c++;
        return c;
    }

    public static double promedioTemperaturasBajas(int[][] m) {
        int suma = 0, n = 0;
        for (int[] f : m)
            for (int t : f)
                if (t < 30) { suma += t; n++; }
        return n > 0 ? (double) suma / n :0;
    }
}
}