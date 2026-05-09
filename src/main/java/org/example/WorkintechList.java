package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<T> extends ArrayList<T> {
    @Override
    public boolean add(T t){
        if(this.contains(t)){
            return false;
        }
        return super.add(t);
    }

    @Override
    public void add(int index, T element){
        if(!this.contains(element)){
            super.add(index, element);
        }
    }

    public void sort(){
        Collections.sort((ArrayList) this);
    }

    @Override
    public boolean remove(Object o){
        boolean isRemoved = super.remove(o);
        if(isRemoved){
            this.sort();
        }
        return isRemoved;
    }
}


/*

 * WorkintechList sınıfınde ```sort``` isminde bir metot tanımlamalısınız ve
 *WorkintechList'e eklenmiş tüm değerleri sıralamalı(String ise A'dan Z'ye)(numeric ise 0'dan sonsuza doğru)
 * WorkintechList sınıfında bir ```remove``` metodu olmalı. Parametre olarak Object tipinde bir parametre almalı.
 * ```remove``` metodu aldığı parametreyi WorkintechList'ten silmeli ve WorkintechList'te bulunan tüm elemanları sıralamalı.
 */