package org.mushare.wooder.server.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private Long createdAt;

  @Column(nullable = false)
  private Long updatedAt;

  @Column(nullable = false)
  private String name;

  @Column
  private String description;

  @ManyToOne
  @JoinColumn(nullable = false, name = "create_user_id")
  private UserDto createdByUserDto;

  @ManyToOne
  @JoinColumn(name = "group_id")
  private GroupDto groupDto;

}
