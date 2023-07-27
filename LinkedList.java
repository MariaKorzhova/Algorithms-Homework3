public class LinkedList<T> {

    /**
     * Ссылка на первый элемент связного списка
     */
    private Node head;

    /**
     * Узел
     */
    class Node{

        /**
         * Ссылка на следующий элемент связного списка
         */
        public Node next;

        /**
         * Значение
         */
        public T value;

    }

    /**
     * Метод для инверсии связного списка
     */
    public void invertedList(){
        if (head != null && head.next != null){
            Node node = head.next;
            head.next = null;
            while (node != null) {
                Node nextNode = node.next;
                node.next = head;
                head = node;
                node = nextNode;
        }
    }

    }

    /**
     * Добавление нового элемента в начало связного списка
     * @param value значение
     */
    public void addFirst(T value){
        Node node = new Node();
        node.value = value;
        if (head != null){
            node.next = head;
        }
        head = node;
    }

    /**
     * Удалить первый элемент связного списка
     */
    public void removeFirst(){
        if (head != null){
            head = head.next;
        }
    }

    public T contains(T value){
        Node node = head;
        while (node != null){
            if (node.value.equals(value))
                return node.value;
            node = node.next;
        }
        return null;
    }

    
    /**
     * Добавление значения в конец связного списка
     * @param value значение
     */
    public void addLast(T value){
        Node node = new Node();
        node.value = value;
        if (head == null){
            head = node;
        }
        else {
            Node lastNode = head;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
    }

    /**
     * Удаление элемента из конца связного списка
     */
    public void removeLast(){
        if (head == null)
            return;
        Node node = head;
        while (node.next != null){
            if (node.next.next == null){
                node.next = null;
                return;
            }
            node = node.next;
        }
        head = null;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node node = head;
        while (node != null){
            stringBuilder.append(node.value);
            stringBuilder.append('\n');
            node = node.next;
        }
        return stringBuilder.toString();
    }
}