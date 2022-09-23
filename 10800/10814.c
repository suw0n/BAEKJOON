#include <stdio.h>
#include <stdlib.h>

struct person{
  int age;
  int seq;
  char s[110];
}typedef Person;

Person arr[100000];

int comp(const void *a, const void *b){
  Person *x = (Person*)a;
  Person *y = (Person*)b;
  return x->age > y->age ? 1 : x->age < y->age ? -1 : x->seq > y->seq ? 1 : -1;
}

int main() {
  int n;
  scanf("%d", &n);
  for(int i = 0; i<n; i++)
    scanf("%d %s", &arr[i].age, arr[i].s), arr[i].seq = i;
  qsort(arr, n, sizeof(arr[0]), comp);
  for(int i = 0; i<n; i++)
    printf("%d %s\n", arr[i].age, arr[i].s);

  return 0;
}