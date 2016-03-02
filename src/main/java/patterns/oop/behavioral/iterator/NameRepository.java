package patterns.oop.behavioral.iterator;

class NameRepository implements Container {

    public String[] names = {"Robert", "John", "Julie", "Lora"};


    public Iterator getIterator() {
        return new NameIterator();
    }


    private class NameIterator implements Iterator {

        int index;


        public boolean hasNext() {
            return index < names.length;
        }


        public Object next() {

            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
