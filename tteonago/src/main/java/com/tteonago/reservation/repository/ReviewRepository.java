package com.tteonago.reservation.repository;

//import com.tteonago.hotel.entity.Room;
import com.tteonago.reservation.entity.Reservation;
import com.tteonago.reservation.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
//import java.util.List;


@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer>{

    @Query("select rv from Review rv where rv.reservation = :reservation")
    Review findReviewByReservation(@Param("reservation") Reservation reservation);

//    @Query("select rv from Reservation r join Review rv on r.resIndex = rv.reservation.resIndex where r.room = :room")
//    List<Review> findReservationAndReviewByRoom(@Param("room") Room room);
}
