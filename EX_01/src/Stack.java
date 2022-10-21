import java.util.LinkedList;

public class Stack<T> {

        LinkedList<T> calvos = (LinkedList<T>) new LinkedList<String>();

    public Stack(){
        super();
    }

    public <T> void isEmpty(){

        if(calvos.isEmpty()){
            System.out.println("La lista se encuentra vacía");
        }else{
            System.out.println("La lista no esta vacia");
        }
    }

    public<T> void removeFirst(){

        System.out.println("El primer elemento de la lista " + calvos.removeFirst() + " ha sido borrado.");
        }


    public<T> void getFirst(){

        System.out.println("El primer elemento de la lista es: " + calvos.getFirst());
        }


    public T add( T Mollejo){

        calvos.add(Mollejo);

        return  Mollejo;
        }

    public String toString(){


        return null;
    }

}

