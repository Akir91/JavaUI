import javax.swing.JOptionPane;

public class main 
{
    public static void main(String[] args) 
    {
        String nombre;
        byte edad;
        float estatura;
        char inicial;
        boolean esAlumno;
        
        nombre = JOptionPane.showInputDialog("Digita tu nombre: ");
        inicial = nombre.charAt(0);
        edad = Byte.parseByte(JOptionPane.showInputDialog("Digita tu edad: "));
        estatura = Float.parseFloat(JOptionPane.showInputDialog("Digita tu estatura: "));
        esAlumno = Boolean.parseBoolean(JOptionPane.showInputDialog("¿Eres alumno? (true/false): "));
        
        JOptionPane.showMessageDialog(null, "Bienvenido " + nombre 
                                                        + "\nTu inicial es : " + inicial
                                                        + "\nTienes " + edad + " años" 
                                                        + "\n Mides " + estatura + " metros"
                                                        + "\n ¿Eres alumno? " + esAlumno); 
    }
}
