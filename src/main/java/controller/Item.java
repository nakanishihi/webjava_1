package controller;

import java.util.ArrayList;
import java.util.List;

public class Item {
  List<String[]>itemList = new ArrayList<String[]>();
  
  public void addItem() {
    String[] item1 = {"キーボード","価格 1000円"};
    String[] item2 = {"ノートパソコン","価格 10000円"};
    String[] item3 = {"マウス","価格 300円"};
    itemList.add(item1);
    itemList.add(item2);
    itemList.add(item3);
    
    System.out.println("aaaaaa");
  }
  
  public List<String[]> getAllItems(){
    
    
    return itemList;
    
  }
}
