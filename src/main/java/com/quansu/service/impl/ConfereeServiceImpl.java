package com.quansu.service.impl;

import com.quansu.daointerface.MeetingConfereeMapper;
import com.quansu.pojo.MeetingConferee;
import com.quansu.pojo.MeetingConfereeExample;
import com.quansu.service.ConfereeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cxy
 * @date 2019/5/15
 */
@Service
public class ConfereeServiceImpl implements ConfereeService {

    @Autowired
    MeetingConfereeMapper confereeMapper;

    @Override
    public Integer addOneConfereeMessage(MeetingConferee conferee) {
        return confereeMapper.insertSelective(conferee);
    }

    @Override
    public List<MeetingConferee> findConfereeByMeetingId(Long meetingId) {
        MeetingConfereeExample example = new MeetingConfereeExample();
        example.createCriteria().andMeetingIdEqualTo(meetingId.toString())
                .andDeleteStateEqualTo(false);
        return confereeMapper.selectByExample(example);
    }
}
