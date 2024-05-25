package com.example.hotel_management_system.Repository;

import com.example.hotel_management_system.Models.Room_Type_Bed;
import com.example.hotel_management_system.Models.Room_Type_Feature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Room_Type_BedRepository extends JpaRepository<Room_Type_Bed, Long> {


}