package com.bookt.bookt;

class GalleryFilterSetter {

    String filterText;
    boolean checked;

    GalleryFilterSetter(String filterText, boolean checked){
        this.filterText = filterText;
        this.checked = checked;
    }

    public void setFilterText(String filterText){
        this.filterText = filterText;
    }

    public void setChecked(boolean checked){
        this.checked = checked;
    }

    public boolean getChecked(){
        return this.checked;
    }

    public String getFilterText (){
        return filterText;
    }

}
