package com.claim.database;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.claim.model.Player;

/** Represents the PlayerRepository for database
 * @author Rocco Saracino und Valentina Caldana
 * -basic structure for CRUD
*/

/** Specification of search and delete in database
*/
@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
	Player findByHand_Id(Player player);
	Optional<Player> findFirstByAccount_Email(String username);
	
}
