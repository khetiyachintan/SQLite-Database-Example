package chintan.khetiya.sqlite.cursor;

public class Contact {

    // private variables
    public int _id;
    public String _name;
    public String _phone_number;
    public String _email;

    public Contact() {
    }

    // constructor
    public Contact(int id, String name, String _phone_number, String _email) {
	this._id = id;
	this._name = name;
	this._phone_number = _phone_number;
	this._email = _email;

    }

    // constructor
    public Contact(String name, String _phone_number, String _email) {
	this._name = name;
	this._phone_number = _phone_number;
	this._email = _email;
    }

    // getting ID
    public int getID() {
	return this._id;
    }

    // setting id
    public void setID(int id) {
	this._id = id;
    }

    // getting name
    public String getName() {
	return this._name;
    }

    // setting name
    public void setName(String name) {
	this._name = name;
    }

    // getting phone number
    public String getPhoneNumber() {
	return this._phone_number;
    }

    // setting phone number
    public void setPhoneNumber(String phone_number) {
	this._phone_number = phone_number;
    }

    // getting email
    public String getEmail() {
	return this._email;
    }

    // setting email
    public void setEmail(String email) {
	this._email = email;
    }

}