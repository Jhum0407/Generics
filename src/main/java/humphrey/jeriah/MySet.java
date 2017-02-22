package humphrey.jeriah;

/**
 * Created by jeriahhumphrey on 2/22/17.
 */
public class MySet <E>{
    private E[] array;
    private int index;

    public MySet(){
        array = (E[]) new Object[0];
    }

    public int size(){
        return array.length;
    }

    public E get(int indexPosition){
       return array[indexPosition-1];
    }

    public boolean contains(E element){
        for(int i = 0;i<size();i++){
            if (array[i].equals(element)){
                index = i+1;
                return true;
            }
        }
        return false;
    }

    public void clear(){
        E[] newArray = (E[]) new Object[0];
        array= newArray;
    }



    public boolean add(E element){
        if((contains(element))) {
            return true;
        }
        else{
            E[] newArray = (E[]) new Object[size() + 1];
            for (int i = 0; i < size(); i++) {
                newArray[i] = array[i];
            }
            newArray[size()] = element;
            array = newArray;
            return true;
        }
    }

    public boolean isEmpty() {
        if (size()==0){
            return true;
        }
        return false;
    }

    public boolean remove(E element){
        if(contains(element)){
            E[] newArray = (E[]) new Object[size() - 1];
            if (index == 1) {
                for (int i = 0; i < size() - 1; i++) {
                    newArray[i] = array[i + 1];
                }
            } else {
                for (int i = 0; i < index - 1; i++) {
                    newArray[i] = array[i];
                }
                for (int i = index - 1; i < size() - 1; i++) {
                    newArray[i] = array[i + 1];
                }
                array = newArray;
            }
            return true;
        }
        return false;
    }
}
