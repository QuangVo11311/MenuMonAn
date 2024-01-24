package BUS;

import DTO.Foods;

import java.util.ArrayList;

public class MonChinhBUS {
    private final ArrayList<Foods> listFoods;

    public MonChinhBUS() {
        listFoods = new ArrayList<>();
        this.setData();
    }

    public void setData() {
        listFoods.add(new Foods("Com", "20000"));
        listFoods.add(new Foods("Chao", "30000"));
        listFoods.add(new Foods("Mi", "30000"));
        listFoods.add(new Foods("Nui", "30000"));
        listFoods.add(new Foods("Banh Canh Cua", "40000"));
        listFoods.add(new Foods("Banh Da Cua", "40000"));
        listFoods.add(new Foods("Banh Da Da", "40000"));
        listFoods.add(new Foods("Banh Trung Vit", "40000"));
        listFoods.add(new Foods("Banh Pho", "40000"));
        listFoods.add(new Foods("Banh Banh Vit", "40000"));
        listFoods.add(new Foods("Banh quack quack", "12121"));

    }

    public ArrayList<Foods> getData() {
        return listFoods;
    }

    public Foods getItemValue(String name) {
        for (Foods item : listFoods) {
            if (item.getName().equals(name)) return item;
        }
        return null;
    }
}
