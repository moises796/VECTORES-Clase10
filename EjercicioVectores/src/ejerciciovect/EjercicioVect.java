package ejerciciovect;
import javax.swing.JOptionPane;
public class EjercicioVect {

    
    public static void main(String[] args) {
        int n;
        n=Integer.parseInt(JOptionPane.showInputDialog("Cuantos almunos ingresaras"));
        int [] codigo=new int[n];
        String [] nombre=new String[n];
        Double [] nota=new Double[n];
        
        for(int i=0;i<n;i++){
           codigo[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del estudiante"+(i+1)));
           nombre[i]=JOptionPane.showInputDialog("Ingrese el nombre del alumno"+(i+1));
           nota[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del estudiante "+(i+1)));
           
        }
        calculoPromedio(codigo, nombre, nota);
    }
    
    public static void calculoPromedio(int [] codigo,String [] nombre,Double [] nota){
        for(int i=0;i<codigo.length;i++){
            if(nota[i]>0 && nota[i]<3){
                JOptionPane.showMessageDialog(null, "La calificacion del estudiante "+nombre[i]+" es:"+nota[i]+" NO MUY BUENA");
            }else if(nota[i]>=3 && nota[i]<6){
                JOptionPane.showMessageDialog(null, "La calificacion del estudiante "+nombre[i]+" es:"+nota[i]+" MEDIOCRE");
            }else if(nota[i]>=6 && nota[i]<8){
                JOptionPane.showMessageDialog(null, "La calificacion del estudiante "+nombre[i]+" es:"+nota[i]+" BUENA");
            }else if(nota[i]>=8){
                JOptionPane.showMessageDialog(null, "La calificacion del estudiante "+nombre[i]+" es:"+nota[i]+" EXCELENTE");
            }
        }
    }
    
}
