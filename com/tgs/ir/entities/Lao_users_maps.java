package com.tgs.ir.entities;

public class Lao_users_maps {
@Column(name="user_map_id")
 
 private Integer  userMapId;

@Column(name="lao_user_id")
 
 private Integer  laoUserId;

@Column(name="map_path")
 
 private String  mapPath;

@Column(name="is_latest")
 
 private boolean  isLatest;


    public Lao_users_maps(int user_map_id, int lao_user_id, Object map_path, boolean is_latest) {
        this.user_map_id = user_map_id;
        this.lao_user_id = lao_user_id;
        this.map_path = map_path;
        this.is_latest = is_latest;
    }
}
