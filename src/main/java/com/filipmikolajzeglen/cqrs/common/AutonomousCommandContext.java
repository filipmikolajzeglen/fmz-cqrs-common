package com.filipmikolajzeglen.cqrs.common;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AutonomousCommandContext
{
   private final Dispatcher dispatcher;

   protected <TYPE> TYPE execute(Command<TYPE> command)
   {
      return dispatcher.execute(command);
   }

   protected <TYPE, PAGE> PAGE perform(Query<TYPE> query, Pagination<TYPE, PAGE> pagination)
   {
      return dispatcher.perform(query, pagination);
   }
}