package BUS;

import DTO.Foods;

import java.util.ArrayList;

public class MonPhuBUS {
    private final ArrayList<Foods> listFoods;

    public MonPhuBUS() {
        listFoods = new ArrayList<>();
        this.setData();
    }

    public void setData() {
        listFoods.add(new Foods("Tom Chien", "15000"));
        listFoods.add(new Foods("Banh Gio", "15000"));
        listFoods.add(new Foods("Thit Xien", "15000"));
        listFoods.add(new Foods("Banh Trang Tron", "15000"));
        listFoods.add(new Foods("Banh Trang Nuong", "15000"));
        listFoods.add(new Foods("Banh Chien Bo", "15000"));
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
