package conversióndebases;

import java.math.BigInteger;
import javax.swing.JOptionPane;

/** Conversión exacta, sin almacenar un binario como número decimal flotante. */
public class convertidores {
    public static String binarioADecimal(String entrada) {
        return convertir(entrada, 2, 10, "[01]+");
    }

    public static String decimalABinario(String entrada) {
        return convertir(entrada, 10, 2, "[0-9]+");
    }

    private static String convertir(String entrada, int origen, int destino, String patron) {
        if (entrada == null) throw new IllegalArgumentException("No se ingresó un número.");
        String texto = entrada.trim();
        if (texto.length() > 4096 || !texto.matches(patron)) {
            throw new IllegalArgumentException("Usa entre 1 y 4096 dígitos válidos, sin signo ni fracciones.");
        }
        return new BigInteger(texto, origen).toString(destino);
    }

    public void binDec() { pedir(true); }
    public void decBin() { pedir(false); }

    private void pedir(boolean binario) {
        while (true) {
            String texto = JOptionPane.showInputDialog(binario ? "Número binario (solo 0 y 1):" : "Número decimal entero no negativo:");
            if (texto == null) return;
            try {
                String resultado = binario ? binarioADecimal(texto) : decimalABinario(texto);
                javax.swing.JTextArea area = new javax.swing.JTextArea(resultado, 8, 45);
                area.setLineWrap(true); area.setWrapStyleWord(true); area.setEditable(false);
                JOptionPane.showMessageDialog(null, new javax.swing.JScrollPane(area), binario ? "Decimal" : "Binario", JOptionPane.INFORMATION_MESSAGE);
                return;
            } catch (IllegalArgumentException error) {
                JOptionPane.showMessageDialog(null, error.getMessage(), "Revisa el número", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
