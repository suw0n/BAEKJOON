#include <stdio.h>
#include <stdlib.h>

typedef struct{
  char s[15];
  int kor;
  int eng;
  int mat;
}Stu;

int n;
Stu stu[100000];

int comp(const void *a, const void *b){
  Stu *x = (Stu*)a;
  Stu *y = (Stu*)b;
  return x->kor < y->kor ? 1 : x->kor == y->kor && x->eng > y->eng ? 1 : x->kor == y->kor && x->eng == y->eng && x->mat < y->mat ? 1 : x->kor == y->kor && x->eng == y->eng && x->mat == y->mat ? strcmp(x->s, y->s) : 0;
}

int main() {
  scanf("%d", &n);
  for(int i = 0; i<n; i++)
    scanf("%s %d %d %d", stu[i].s, &stu[i].kor, &stu[i].eng, &stu[i].mat);
  qsort(stu, n, sizeof(stu[0]), comp);
  for(int i = 0; i<n; i++)
    printf("%s\n", stu[i].s);

  return 0;
}