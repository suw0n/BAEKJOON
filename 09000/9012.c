#include <stdio.h>

int t, top = -1, stack[55];
char s[55];

int is_full(){
  return top==49 ? 1 : 0;
}

int is_Empty(){
  return top==-1 ? 1 : 0;
}

void push(int item){
  if(is_full())
    exit(0);
  stack[++top] = item;
}

int pop(){
  if(is_Empty())
    exit(0);
  return stack[top--];
}

int check_Matching(char *str, int n){
  for(int i = 0; i<n; i++){
    if(str[i]=='(')
      push(str[i]);
    else
      if(is_Empty() || pop()=='(' && str[i]!=')')
        return 0;
  }
  return is_Empty();
}

int main() {
  scanf("%d", &t);
  while(t--){
    scanf(" %s", s), top = -1;
    printf("%s\n", check_Matching(s, strlen(s)) ? "YES" : "NO");
  }

  return 0;
}