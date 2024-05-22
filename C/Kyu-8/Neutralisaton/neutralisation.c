#include <stdio.h>

void neutralize(const char *s1, const char *s2, char *s3) {

  while (*s1) {
    if (*s1 == *s2) {
      *s3 = *s1;
    } else {
      *s3 = '0';
    }
    s1++;
    s2++;
    s3++;
  }
  *s3 = '\0';
}

int main() {

  char s1[] = "--++-+-";
  char s2[] = "++--+-+";
  char s3[8];

  neutralize(s1, s2, s3);

  printf("%s\n", s3);

  return 0;
}
