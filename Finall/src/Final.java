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
        return n > 0 ? (double) suma / n : 0;
    }

    public static void imprimirTemperaturasPeligrosas(int[][] m) {
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                if (m[i][j] > 75)
                    System.out.println("Temperatura crítica en [" + i + "][" + j + "]: " + m[i][j] + " grados");
    }

    public static int[] equipoMasCaliente(int[][] m) {
        int max = Integer.MIN_VALUE, x = 0, y = 0;
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                if (m[i][j] > max) { max = m[i][j]; x = i; y = j; }
        return new int[]{x, y};
    }

    public static void main(String[] args) {
        int[][] temperaturas = {
            {25, 32, 61, 78, 45},
            {19, 29, 72, 65, 80},
            {22, 28, 35, 55, 60},
            {21, 85, 40, 50, 30}
        };

        System.out.println("Equipos >60°: " + contarTemperaturasAltas(temperaturas));
        System.out.println("Promedio <30°: " + promedioTemperaturasBajas(temperaturas));
        imprimirTemperaturasPeligrosas(temperaturas);
        int[] pos = equipoMasCaliente(temperaturas);
        System.out.println("Equipo más caliente en: [" + pos[0] + "][" + pos[1] + "]");
    }
}