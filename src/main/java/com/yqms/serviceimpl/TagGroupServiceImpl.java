package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yqms.model.TagGroup;
import com.yqms.repository.TagGroupRepository;
import com.yqms.service.TagGroupService;

@Service
public class TagGroupServiceImpl implements TagGroupService {
	
	@Autowired
	TagGroupRepository tagGroupRepository;

	@Override
	public List<TagGroup> getAllTagGroups() {

		List<TagGroup> tagGroupList  = tagGroupRepository.findAll();		
		return tagGroupList;
		
	}

	@Override
	public TagGroup addTagGroup(TagGroup tagGroup) {
		return tagGroupRepository.save(tagGroup);
	}

	@Override
	public TagGroup getTagGroupById(String id) {
		return tagGroupRepository.findById(id).get();
	}
	
	

}
