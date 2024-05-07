#include <stdio.h>

int quarter_of(int month) { return (month + 2) / 3; }

int main() {
  printf("%d\n", quarter_of(3));  // 1
  printf("%d\n", quarter_of(8));  // 3
  printf("%d\n", quarter_of(11)); // 4
  return 0;
}
