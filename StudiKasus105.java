# JOBSHEET-6-CASE STUDY: SELECTION STRUCTURES WITH GIT AND GITHUB


## Identitas Mahasiswa:

* **Nama:** Cantika Putri Fauzan 
* **NIM:** 264107020237
* **Kelas / No. Presensi:** 1I / 05

  ### 1:  Learning Objectives
1. Students are able to solve case studies using basic and nested selection structures
2. Students are able to save and submit their work using Git and GitHub through Visual Studio
Code
3. Students are able to collaborate with classmates using GitHub

  ### 2. LAB ACTIVITIES & ANALYSIS

#### 2.1.1  Experiment 2: Case Study 1 – Basic Selection
  Kedai Kopi Senja (Senja Coffee Shop) sells Kopi Susu Gula Aren (Palm Sugar Milk Coffee) for
Rp18,000 per cup and gives a 10% discount on purchases of at least Rp100,000. The shop owner needs
a simple cashier program to calculate the total payment and the change. Write a Java program based
on the flowchart below.
  
##### 2.1.2 Java Program Code
  
  import java.util.Scanner;
  public class StudiKasus105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

       
        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar : ");
        uangBayar = sc.nextInt();

       
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

       
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }
      
        totalBayar = totalHarga - diskon;
      
        System.out.println("Total harga         : Rp " + totalHarga);
        System.out.println("Diskon              : Rp " + diskon);
        System.out.println("Total bayar         : Rp " + totalBayar);

        
           // logika diskon dan kembalian
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian           : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }

        sc.close();
    }
}

#### 2.1.3 Hasil Running / Screenshot Output
Masukkan jumlah cup : 3
Masukkan uang bayar : 50000
Total harga         : Rp 54000
Diskon              : Rp 0
Total bayar         : Rp 54000
Uang tidak cukup, kurang Rp 4000

 #### 2.2 Experiment 3: Case Study 2 – Nested Selection
    The Student Affairs Division of Politeknik Negeri Malang has issued a letter regarding the
verification of complete achievement documents for students in Activity Year 2026, Stage I. Based
on the requirements in that letter, the institution's award funds are given to students under the
following conditions...

  
  
