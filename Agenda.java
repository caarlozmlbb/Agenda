
import java.util.ArrayList;

public class Agenda
{
    private ArrayList<Nota> lista;
    
    public Agenda(){
        //Inicializar la coleccion
        lista = new ArrayList<Nota>();
    }
    public void addNota(Nota nota){
        lista.add(nota);
    }
    public void listarNotas(){
        if(lista.size() > 0){
            for(Nota item : lista){
                item.mostrar();
            }
        }else{
            System.out.println("-------------------------");
            System.out.println("No hay notas en la AGENDA");
            System.out.println("-------------------------");
        }
    }
    public void contarNotas(){
        System.out.println("-------------------------");
        System.out.println("En la agenda existen "+lista.size()+ " notas");
        System.out.println("-------------------------");
    }
    public void borrarNota(int id){
        int pos = -1;
        boolean flag = false;
        
        if (lista.size() > 0){
            for(Nota item : lista){
                pos++;
                if(item.getId() == id){
                    flag = true;
                    break;
                } 
            }
            if (flag){
                lista.remove(pos);
            }
        }
    }
}
