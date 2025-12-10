class Sort{
public static void main (String[]args){
int arr[]={90,40,30,80};
int temp=0;
//buble sort logic
for(int i=0;i<arr.length-1; i++){
	for(int j=0;j<arr.length-1-i; j++){
       if (arr[j] > arr[j+1]) {
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
       }
    }
}
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+",");
}
}
}

//Arrays.sort(arr);

| Type                           | Method   | Order                | Difficulty |
| ------------------------------ | -------- | -------------------- | ---------- |
| Bubble Sort                    | Manual   | Ascending/Descending | Easy       |
| Selection Sort                 | Manual   | Ascending            | Easy       |
| Insertion Sort                 | Manual   | Ascending            | Easy       |
| Merge Sort                     | Manual   | Ascending            | Medium     |
| Quick Sort                     | Manual   | Ascending            | Medium     |
| Arrays.sort()                  | Built-in | Ascending            | Very Easy  |
| Arrays.sort() + reverseOrder() | Built-in | Descending           | Very Easy  |
