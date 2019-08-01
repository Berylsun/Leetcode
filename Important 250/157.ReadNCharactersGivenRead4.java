//1, n
public int read(char[] buf, int n) {
    char[] temp = new char[4];
    int index = 0;
    
    while (true) {
        int count = read4(temp);
        count = Math.min(count, n - index);
        for (int i = 0; i < count; i++) {
            buf[index++] = temp[i];
        }
        if (index == n || count < 4) {
            return index;
        }
    }
}
