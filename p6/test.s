int f1(int a, int b) {
    int w;
    a(Offset: 4) = 1;
    b(Offset: 8) = 2;
    w(Offset: -8) = 3;
}

void main() {
    int a;
    bool b;
    a(Offset: -8) = 1;
    b(Offset: -12) = false;
    disp << "Hello world!";
    disp << "\n";
    if ((a(Offset: -8) == 1)) {
        int k;
        bool q;
        k(Offset: -16) = (-1);
        q(Offset: -20) = true;
    }
    else {
        a(Offset: -8) = f1(Formal size: 8, Local size: 4)(1, 2);
    }
}

