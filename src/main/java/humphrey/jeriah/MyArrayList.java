package humphrey.jeriah;

import java.util.Objects;

/**
 * Created by jeriahhumphrey on 2/22/17.
 */
public class MyArrayList <E> {
    private E[] array;


    public MyArrayList (){
      array = (E[]) new Object[10];

    }

    public int size(){
        return array.length;
    }

    public  MyArrayList(int num){

        array = (E[]) new Object[num];

    }

    public boolean add(E element){
        E[] newArray = (E[]) new Object[size()+1];
        for(int i =0;i<size();i++){
            newArray[i]=array[i];
        }
        newArray[size()]=element;
        array = newArray;
            return true;
    }


    public boolean add(int index, E element){
        E[] newArray = (E[]) new Object[size()+1];
        for(int i =0;i<index-1;i++){
            newArray[i]=array[i];
        }
        for(int i =index;i<size();i++){
            newArray[i]=array[i];
        }

        newArray[index-1]=element;
        array = newArray;
        return true;
    }


    public E set(int index, E element){
        array[index-1]=element;

        return array[index-1];
    }


    public E get(int index){
        return array[index-1];
    }


    public E remove(int index) {
        E[] newArray = (E[]) new Object[size() - 1];
        E element = array[index];
        if (index == 0) {
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
                return element;
    }


    public boolean remove(E element){
        for(int i = 0;i<size()-1;i++){
            if (array[i].equals(element)){
                remove(i+1);
                return true;
            }
        }
        return false;
    }

    public void clear(){
        E[] newArray = (E[]) new Object[0];
        array= newArray;
        }


    public boolean contains(E element){
        for(int i = 0;i<size()-1;i++){
            if (array[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        if (size()==0){
            return true;
        }
        return false;
    }

    }




