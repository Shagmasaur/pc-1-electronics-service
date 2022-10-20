package com.jap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElectronicListService
{
    //add all the electronics items inside the List
    public static List<String> addElectronicsItemsToList(String electronicsItems) {
        List<String> itemList = null;
        String[] value = electronicsItems.split(",");
        itemList = new ArrayList<>();
        for (int i = 0; i < value.length; i++) {
            if(!itemList.contains(value[i])){
                itemList.add(value[i]);
            }
        }

        return itemList;
    }

    //search the electronic item from the list and return the index position
    public static int searchElectronicItemInList(List<String> itemList, String searchItem) {

        return itemList.indexOf(searchItem);
    }

    //remove the electronic item from the list using iterator
    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem)
    {
        boolean flag = false;
        Iterator<String> stringIterator = itemList.iterator();
        while(stringIterator.hasNext()){
            if(stringIterator.next().equals(removeItem)){
                stringIterator.remove();
                flag = true;
            }
        }
        return flag;
    }

    public static void main(String[] args)
    {
        System.out.println(addElectronicsItemsToList("TV,Computer,Refrigerator,TV"));

        List<String> itemList = addElectronicsItemsToList("TV,Computer,Refrigerator,TV");

        System.out.println(searchElectronicItemInList(itemList, "Computer"));

        System.out.println(removeElectronicsItemFromList(itemList, "Computer"));
    }
}

