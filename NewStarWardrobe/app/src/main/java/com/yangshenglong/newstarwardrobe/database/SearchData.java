package com.yangshenglong.newstarwardrobe.database;

import com.litesuits.orm.db.annotation.PrimaryKey;
import com.litesuits.orm.db.annotation.Table;
import com.litesuits.orm.db.enums.AssignType;

/**
 * Created by CST on 16/12/29.
 */
@Table("search")
public class SearchData {
    @PrimaryKey(AssignType.AUTO_INCREMENT)
    int id;

    String searchText;

    public SearchData(String searchText) {
        this.searchText = searchText;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }
}
