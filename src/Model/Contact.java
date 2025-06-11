package Model;


public class Contact <T,U> {
    private T name;
    private U phone;

    public Contact(T name, U phone) {
        this.name = name;
        this.phone = phone;
    }

    

    public Contact(T name) {
        this.name = name;
    }



    public T getName() {
        return name;
    }

    public U getPhone() {
        return phone;
    }

     public void setName(T name) {
        this.name = name;
    }

    public void setPhone(U phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + " | " + phone;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {  //equals le puede llegar cualquier valor
       if (obj == null) return false;
       if(this == obj) return true;
       if (obj == null || getClass() != obj.getClass()) {
           return false;
       }
       //si pasaron estos validadores OBJ Y THIS SON CLASE CONTACTO
       Contact c = (Contact) obj;
       return name != null && name.equals(c.getName());

    }

    
  
}
