package com.company;

//Metotlarda base class olan User kullanıldığı için, bu class'ı inherit eden bütün classlar kullanılabilir.
public class UserManager {
    public void Add(User user){
        System.out.println("Eklendi : " + user.getFirstName());
    }

    public void Delete(User user){
        System.out.println("Silindi : " + user.getFirstName());
    }

    public void Update(User user){
        System.out.println("Güncellendi : " + user.getFirstName());
    }

    public void GetUserByUserId(int userId){
        System.out.println("User Id'si " + userId + " olan kişi getirildi");
    }

}
