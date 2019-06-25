package info.whats_online.BASIC_IMAGE_GALLERY_APP;

public class Contact {

    //private variables
    int _id;
    String _fname;
    byte[] _img;



    // Empty constructor
    public Contact(){

    }
    // constructor
    public Contact(int id, String fname, byte[] img){
        this._id = id;
        this._fname = fname;
        this._img = img;

    }

    // constructor
    public Contact(String fname, byte[] img){

        this._fname = fname;
        this._img = img;

    }

    // getting ID
    public int getID(){
        return this._id;
    }

    // setting ID
    public void setID(int id){
        this._id = id;
    }

    // getting  image title
    public String getFName(){
        return this._fname;
    }

    // setting image title
    public void setFName(String fname){
        this._fname = fname;
    }

    //getting select image
    public byte[] getImage(){
        return this._img;
    }

    //setting select image

    public void setImage(byte[] b){
        this._img=b;
    }

}

