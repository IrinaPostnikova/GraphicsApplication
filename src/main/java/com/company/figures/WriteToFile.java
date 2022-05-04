package com.company.figures;

public class WriteToFile {

    //чтение из файла
//        File file=new File("\\D:\\texts\\text");
//        Scanner s=new Scanner(file);
//        while (s.hasNextLine()){
//            System.out.println(s.nextLine());
//        }
//          s.close();//не видит файл на компе

//        File file=new File("test");
//        Scanner s=new Scanner(file);
//        while (s.hasNextLine()){
//            System.out.println(s.nextLine());
//        }
//          s.close();

    //запись в файл
//        File file1=new File("file");
//        PrintWriter pw=new PrintWriter(file1);
//        pw.println(circle);
//        pw.close();
//
//        //чтение из файла через buffered
//        File file1 = new File("file");
//        FileReader fr = new FileReader(file1);
//        BufferedReader reader = new BufferedReader(fr);
//        String str;
//
//        while ((str = reader.readLine()) != null) {
//            System.out.println(str);
//            String qq = String.valueOf(str.indexOf("a"));
//            System.out.println(qq);
    //        }


//        сериализация

//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("figures"))) {
//            oos.writeObject(circle);
//            oos.writeObject(rect);
//            oos.writeObject(triangle);
//            oos.writeObject(poly);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//
////десериализация
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("figures"))) {
//            Figure figure = (Figure) ois.readObject();
//            Figure figure2 = (Figure) ois.readObject();
//            Figure figure1 = (Figure) ois.readObject();
//            Figure figure3 = (Figure) ois.readObject();
//            System.out.println(figure);
//            System.out.println(figure2);
//            System.out.println(figure1);
//            System.out.println(figure3);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
}
