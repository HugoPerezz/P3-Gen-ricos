public class StackArray<T> {

    private T array[];
    int contador = 0;

    public StackArray(){
        super();
        array = (T[]) new Object[3];
    }


    public <T> void isEmpty(){

        if(contador == 0){
            System.out.println("La lista se encuentra vacía");
        }else{
            System.out.println("La lista no esta vacia");
        }
    }

    public <T> void removeFirst(){
       for(int i = array.length; i < 0; i++){
           array[i] = array[i + 1];
           contador--;
       }
    }

    public <T> void add(){

        for(int i = array.length; i > 0; i--){
            array[i] = array[i - 1];
            contador++;
        }
    }

    public <T> void getFirst(){

        System.out.println(array[0]);
    }

    public String toString(){

        return array.toString();
    }

}

